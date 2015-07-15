/*******************************************************************************
 * Copyright (c) 2009, 2010 Alena Laskavaia 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Alena Laskavaia  - initial API and implementation
 *******************************************************************************/
package org.eclipse.cdt.codan.core.cxx.model;

import org.eclipse.cdt.codan.core.model.IChecker;
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;

/**
 * Checker that can/want to process C/C++ AST (Abstract Syntax Tree) of a
 * program
 * Default implementation {@link AbstractIndexAstChecker}
 * 
 * Clients may implement and extend this interface.
 * 
 * <p>
 * <strong>EXPERIMENTAL</strong>. This class or interface has been added as
 * part of a work in progress. There is no guarantee that this API will
 * work or that it will remain the same.
 * </p>
 */
public interface ICAstChecker extends IChecker {
	/**
	 * Runs this checker on a given AST.
	 * AST locks are obtained by the framework before calling this method.
	 * 
	 * @param ast the AST.
	 */
	void processAst(IASTTranslationUnit ast);
}
