package org.example

import org.example.annotation.AllOpen
import org.example.annotation.NoArg
import org.example.dependency.FirstDependency
import org.example.dependency.SecondDependency

@AllOpen
@NoArg
abstract class AbstractServiceModuleB(
    firstDependency: FirstDependency,
    secondDependency: SecondDependency
) : MainAbstractService(firstDependency, secondDependency)