/*--

 $Id: Child.java,v 1.1 2003/05/20 21:53:59 jhunter Exp $

 Copyright (C) 2000 Brett McLaughlin & Jason Hunter.
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:

 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions, and the following disclaimer.

 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions, and the disclaimer that follows
    these conditions in the documentation and/or other materials
    provided with the distribution.

 3. The name "JDOM" must not be used to endorse or promote products
    derived from this software without prior written permission.  For
    written permission, please contact license@jdom.org.

 4. Products derived from this software may not be called "JDOM", nor
    may "JDOM" appear in their name, without prior written permission
    from the JDOM Project Management (pm@jdom.org).

 In addition, we request (but do not require) that you include in the
 end-user documentation provided with the redistribution and/or in the
 software itself an acknowledgement equivalent to the following:
     "This product includes software developed by the
      JDOM Project (http://www.jdom.org/)."
 Alternatively, the acknowledgment may be graphical using the logos
 available at http://www.jdom.org/images/logos.

 THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 DISCLAIMED.  IN NO EVENT SHALL THE JDOM AUTHORS OR THE PROJECT
 CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 SUCH DAMAGE.

 This software consists of voluntary contributions made by many
 individuals on behalf of the JDOM Project and was originally
 created by Brett McLaughlin <brett@jdom.org> and
 Jason Hunter <jhunter@jdom.org>.  For more information on the
 JDOM Project, please see <http://www.jdom.org/>.

 */

package org.jdom;

import java.io.Serializable;
import java.util.Collection;

/**
 * Superclass for JDOM objects which can be legal child content
 * of {@link org.jdom.Parent} nodes.
 *
 * @author Bradley S. Huffman
 * @version $Revision: 1.1 $, $Date: 2003/05/20 21:53:59 $
 * @see org.jdom.Comment
 * @see org.jdom.DocType
 * @see org.jdom.Element
 * @see org.jdom.EntityRef
 * @see org.jdom.Parent
 * @see org.jdom.ProcessingInstruction
 * @see org.jdom.Text
 */
public interface Child extends Cloneable, Serializable {

    /**
     * Detaches this child from its parent or does nothing if the child
     * has no parent.
     *
     * @return parent of this child.
     */
    Child detach();

    /**
     * Return this child's owning document or null if the branch containing
     * this child is currently not attached to a document.
     *
     * @return this child's owning document.
     */
    Document getDocument();

    /**
     * Return this child's parent, or null if this child is currently
     * not attached. The parent can be either an {@link Element}
     * or a {@link Document}.
     *
     * @return this content's parent or <code>null</code> if it is unattached.
     */
    Parent getParent();

    /**
     * Returns the XPath 1.0 string value of this child.
     *
     * @return string value of this child.
     */
    String getValue();

    /**
     * Obtain a deep, unattached copy of this child.
     *
     * @return a deep copy of this child.
     */
    Object clone();
}