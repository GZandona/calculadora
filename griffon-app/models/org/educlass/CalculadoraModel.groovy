package org.educlass

import griffon.core.artifact.GriffonModel
import griffon.transform.Observable
import griffon.metadata.ArtifactProviderFor

@ArtifactProviderFor(GriffonModel)
class CalculadoraModel {
    @Observable int clickCount = 0
        @Observable double number1 = 0
    }

