/*
 * $Id: BoxLayoutHandler.java,v 1.8 2007/10/08 05:20:37 civilis Exp $
 *
 * Copyright (C) 2001 Idega hf. All Rights Reserved.
 *
 * This software is the proprietary information of Idega hf.
 * Use is subject to license terms.
 *
 */
package com.idega.block.boxoffice.business;

import java.util.List;

import com.idega.block.boxoffice.presentation.Box;
import com.idega.core.builder.presentation.ICPropertyHandler;
import com.idega.presentation.IWContext;
import com.idega.presentation.PresentationObject;
import com.idega.presentation.ui.DropdownMenu;

/**
 * @author <a href="tryggvi@idega.is">Tryggvi Larusson</a>
 * @version 1.0
 */
public class BoxLayoutHandler implements ICPropertyHandler {
  /**
   *
   */
  public BoxLayoutHandler() {
  }

  /**
   *
   */
  public List getDefaultHandlerTypes() {
    return(null);
  }

  /**
   *
   */
  public PresentationObject getHandlerObject(String name, String value, IWContext iwc) {
    DropdownMenu menu = new DropdownMenu(name);
    menu.addMenuElement("","Select:");
    menu.addMenuElement(Box.BOX_VIEW,"Box view");
    menu.addMenuElement(Box.CATEGORY_VIEW,"Category view");
    menu.addMenuElement(Box.COLLECTION_VIEW,"Collection view");
    menu.setSelectedElement(value);
    return(menu);
  }

  /**
   *
   */
  public void onUpdate(String values[], IWContext iwc) {
  }

public PresentationObject getHandlerObject(String name, String stringValue,
		IWContext iwc, boolean oldGenerationHandler, String instanceId,
		String method) {
	// TODO Auto-generated method stub
	return null;
}
}
