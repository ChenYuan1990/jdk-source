/*
 * Copyright (c) 2000, 2005, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package sun.jvm.hotspot.code;

import sun.jvm.hotspot.debugger.*;

/** NOTE that this class takes the address of a buffer. This means
    that it can read previously-generated debug information directly
    from the target VM. However, it also means that you can't create a
    "wrapper" object for a CompressedStream down in the VM. It looks
    like these are only kept persistently in OopMaps, and the code has
    been special-cased in OopMap.java to handle this. */

public class CompressedStream {
  protected Address buffer;
  protected int     position;

  /** Equivalent to CompressedStream(buffer, 0) */
  public CompressedStream(Address buffer) {
    this(buffer, 0);
  }

  public CompressedStream(Address buffer, int position) {
    this.buffer   = buffer;
    this.position = position;
  }

  public Address getBuffer() {
    return buffer;
  }

  public static final int LogBitsPerByte = 3;
  public static final int BitsPerByte = 1 << 3;

  // Constants for UNSIGNED5 coding of Pack200
  public static final int lg_H = 6;
  public static final int H = 1<<lg_H;  // number of high codes (64)
  public static final int L = (1<<BitsPerByte) - H; // number of low codes (192)
  public static final int MAX_i = 4;      // bytes are numbered in (0..4)

  // Positioning
  public int getPosition() {
    return position;
  }
  public void setPosition(int position) {
    this.position = position;
  }

  // 32-bit one-to-one sign encoding taken from Pack200
  // converts leading sign bits into leading zeros with trailing sign bit
  public int encodeSign(int value) {
    return (value << 1) ^ (value >> 31);
  }

  public int decodeSign(int value) {
    return (value >>> 1) ^ -(value & 1);
  }

  // 32-bit self-inverse encoding of float bits
  // converts trailing zeros (common in floats) to leading zeros
  public int reverseInt(int i) {
    // Hacker's Delight, Figure 7-1
    i = (i & 0x55555555) << 1 | (i >>> 1) & 0x55555555;
    i = (i & 0x33333333) << 3 | (i >>> 2) & 0x33333333;
    i = (i & 0x0f0f0f0f) << 4 | (i >>> 4) & 0x0f0f0f0f;
    i = (i << 24) | ((i & 0xff00) << 8) | ((i >>> 8) & 0xff00) | (i >>> 24);
    return i;
  }
}
