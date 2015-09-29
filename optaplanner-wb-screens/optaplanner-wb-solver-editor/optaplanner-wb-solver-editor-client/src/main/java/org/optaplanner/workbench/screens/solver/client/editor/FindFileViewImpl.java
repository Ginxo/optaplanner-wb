/*
 * Copyright 2015 JBoss Inc
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
package org.optaplanner.workbench.screens.solver.client.editor;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import org.gwtbootstrap3.client.ui.TextBox;

public class FindFileViewImpl
        extends Composite
        implements FindFileView {

    private FindFile presenter;

    interface Binder
            extends
            UiBinder<Widget, FindFileViewImpl> {

    }

    private static Binder uiBinder = GWT.create( Binder.class );

    @UiField
    TextBox fileName;

//    @UiField
//    FocusPanel findFile;

    public FindFileViewImpl() {
        initWidget( uiBinder.createAndBindUi( this ) );
    }

    @Override
    public void setPresenter( FindFile presenter ) {
        this.presenter = presenter;
    }

    @Override
    public void setFileName( String fileName ) {
        this.fileName.setText( fileName );
    }

    @UiHandler("fileName")
    public void handleChange( ChangeEvent event ) {
        presenter.onFileNameChange( fileName.getText() );
    }
}
