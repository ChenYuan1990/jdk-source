/*
 * Copyright (c) 1997, 2017, Oracle and/or its affiliates. All rights reserved.
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
 *
 */

package com.sun.xml.internal.ws.resources;

import java.util.Locale;
import java.util.ResourceBundle;
import javax.annotation.Generated;
import com.sun.istack.internal.localization.Localizable;
import com.sun.istack.internal.localization.LocalizableMessageFactory;
import com.sun.istack.internal.localization.LocalizableMessageFactory.ResourceBundleSupplier;
import com.sun.istack.internal.localization.Localizer;


/**
 * Defines string formatting method for each constant in the resource file
 *
 */
@Generated("com.sun.istack.internal.maven.ResourceGenMojo")
public final class HandlerMessages {

    private final static String BUNDLE_NAME = "com.sun.xml.internal.ws.resources.handler";
    private final static LocalizableMessageFactory MESSAGE_FACTORY = new LocalizableMessageFactory(BUNDLE_NAME, new HandlerMessages.BundleSupplier());
    private final static Localizer LOCALIZER = new Localizer();

    public static Localizable localizableHANDLER_NESTED_ERROR(Object arg0) {
        return MESSAGE_FACTORY.getMessage("handler.nestedError", arg0);
    }

    /**
     * handler error: {0}
     *
     */
    public static String HANDLER_NESTED_ERROR(Object arg0) {
        return LOCALIZER.localize(localizableHANDLER_NESTED_ERROR(arg0));
    }

    public static Localizable localizableCANNOT_EXTEND_HANDLER_DIRECTLY(Object arg0) {
        return MESSAGE_FACTORY.getMessage("cannot.extend.handler.directly", arg0);
    }

    /**
     * Handler {0} must implement LogicalHandler or SOAPHandler.
     *
     */
    public static String CANNOT_EXTEND_HANDLER_DIRECTLY(Object arg0) {
        return LOCALIZER.localize(localizableCANNOT_EXTEND_HANDLER_DIRECTLY(arg0));
    }

    public static Localizable localizableHANDLER_NOT_VALID_TYPE(Object arg0) {
        return MESSAGE_FACTORY.getMessage("handler.not.valid.type", arg0);
    }

    /**
     * {0} does not implement one of the handler interfaces.
     *
     */
    public static String HANDLER_NOT_VALID_TYPE(Object arg0) {
        return LOCALIZER.localize(localizableHANDLER_NOT_VALID_TYPE(arg0));
    }

    public static Localizable localizableHANDLER_MESSAGE_CONTEXT_INVALID_CLASS(Object arg0, Object arg1) {
        return MESSAGE_FACTORY.getMessage("handler.messageContext.invalid.class", arg0, arg1);
    }

    /**
     * "{0}" is not an allowed value for the property "{1}"
     *
     */
    public static String HANDLER_MESSAGE_CONTEXT_INVALID_CLASS(Object arg0, Object arg1) {
        return LOCALIZER.localize(localizableHANDLER_MESSAGE_CONTEXT_INVALID_CLASS(arg0, arg1));
    }

    public static Localizable localizableHANDLER_PREDESTROY_IGNORE(Object arg0) {
        return MESSAGE_FACTORY.getMessage("handler.predestroy.ignore", arg0);
    }

    /**
     * Exception ignored from invoking handler @PreDestroy method: {0}
     *
     */
    public static String HANDLER_PREDESTROY_IGNORE(Object arg0) {
        return LOCALIZER.localize(localizableHANDLER_PREDESTROY_IGNORE(arg0));
    }

    public static Localizable localizableHANDLER_CHAIN_CONTAINS_HANDLER_ONLY(Object arg0) {
        return MESSAGE_FACTORY.getMessage("handler.chain.contains.handler.only", arg0);
    }

    /**
     * A HandlerChain can only contain Handler instances: {0}
     *
     */
    public static String HANDLER_CHAIN_CONTAINS_HANDLER_ONLY(Object arg0) {
        return LOCALIZER.localize(localizableHANDLER_CHAIN_CONTAINS_HANDLER_ONLY(arg0));
    }

    public static Localizable localizableCANNOT_INSTANTIATE_HANDLER(Object arg0, Object arg1) {
        return MESSAGE_FACTORY.getMessage("cannot.instantiate.handler", arg0, arg1);
    }

    /**
     * Unable to instantiate handler: {0} because: {1}
     *
     */
    public static String CANNOT_INSTANTIATE_HANDLER(Object arg0, Object arg1) {
        return LOCALIZER.localize(localizableCANNOT_INSTANTIATE_HANDLER(arg0, arg1));
    }

    private static class BundleSupplier
        implements ResourceBundleSupplier
    {


        public ResourceBundle getResourceBundle(Locale locale) {
            return ResourceBundle.getBundle(BUNDLE_NAME, locale);
        }

    }

}
