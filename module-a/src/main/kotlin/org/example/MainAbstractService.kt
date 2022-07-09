package org.example

import org.example.annotation.AllOpen
import org.example.annotation.NoArg
import org.example.dependency.FirstDependency
import org.example.dependency.SecondDependency

@AllOpen
@NoArg
abstract class MainAbstractService(
    private val firstDependency: FirstDependency,
    private val secondDependency: SecondDependency
)