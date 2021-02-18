//
// (C) Copyright 2019-2021 Martin E. Nordberg III
// Apache 2.0 License
//

package barlom.dxl.model.properties

import barlom.dxl.model.core.DxlItem
import barlom.dxl.model.expressions.DxlExpression
import barlom.dxl.model.labels.DxlSimpleName
import java.time.Instant

//---------------------------------------------------------------------------------------------------------------------

/** A single property of a concept or connection. */
class DxlProperty(

    /** The name of the property. */
    val name: DxlSimpleName,

    /** The new value of the property. */
    val value: DxlExpression,

    /** The time when this new state became or will become valid. */
    val validTime: Instant?

) : DxlItem(name.origin)

//---------------------------------------------------------------------------------------------------------------------

