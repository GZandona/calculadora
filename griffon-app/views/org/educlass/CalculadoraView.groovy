package org.educlass

import griffon.core.artifact.GriffonView
import griffon.metadata.ArtifactProviderFor
import javax.swing.SwingConstants

@ArtifactProviderFor(GriffonView)
class CalculadoraView {
    FactoryBuilderSupport builder
    CalculadoraModel model

    void initUI() {
        builder.with {
            application(size: [400, 200], id: 'mainWindow',
                title: application.configuration['application.title'],
                iconImage:   imageIcon('/griffon-icon-48x48.png').image,
                iconImages: [imageIcon('/griffon-icon-48x48.png').image,
                             imageIcon('/griffon-icon-32x32.png').image,
                             imageIcon('/griffon-icon-16x16.png').image]) {
                gridLayout(rows: 7, cols: 3)
                label(id: 'clickLabel', text: bind { model.clickCount },
                     horizontalAlignment: SwingConstants.CENTER)
                button(id: 'clickButton', clickAction, text:'Ver Resultado')
                button(id: '1', clickAction, text: 1)
                button(id: '2', clickAction, text: 2)
                button(id: '3', clickAction, text: 3)
                button(id: '4', clickAction, text: 4)
                button(id: '5', clickAction, text: 5)
                button(id: '6', clickAction, text: 6)
                button(id: '7', clickAction, text: 7)
                button(id: '8', clickAction, text: 8)
                button(id: '9', clickAction, text: 9)
                button(id: '0', clickAction, text: 0)
                button(id: '+', clickAction, text: 'Op +')
                button(id: '-', clickAction, text: 'Op -')
            }
        }
    }
}
