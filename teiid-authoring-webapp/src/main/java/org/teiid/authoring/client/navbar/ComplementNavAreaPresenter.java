/*
 * Copyright 2012 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.teiid.authoring.client.navbar;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.uberfire.client.workbench.Header;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

@ApplicationScoped
public class ComplementNavAreaPresenter implements Header {

    public interface View extends IsWidget {

    }

    @Inject
    public View view;

    @Override
    public int getOrder() {
        return 0;
    }

    @Override
    public Widget asWidget() {
        return view.asWidget();
    }

    @Override
    public String getId() {
        // TODO Auto-generated method stub
        return null;
    }

}