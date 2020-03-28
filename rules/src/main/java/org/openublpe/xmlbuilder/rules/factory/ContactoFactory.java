/**
 * Copyright 2019 Project OpenUBL, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Eclipse Public License - v 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openublpe.xmlbuilder.rules.factory;

import org.openublpe.xmlbuilder.core.models.input.common.ContactoInputModel;
import org.openublpe.xmlbuilder.core.models.output.common.ContactoOutputModel;

public class ContactoFactory {

    public static ContactoOutputModel getContacto(ContactoInputModel input) {
        return ContactoOutputModel.Builder.aContactoOutputModel()
                .withEmail(input.getEmail())
                .withTelefono(input.getTelefono())
                .build();
    }

}