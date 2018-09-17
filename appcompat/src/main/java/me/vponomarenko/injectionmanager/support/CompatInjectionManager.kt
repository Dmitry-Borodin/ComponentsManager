package me.vponomarenko.injectionmanager.support

import me.vponomarenko.injectionmanager.InjectionManager

/**
 * Author: Valery Ponomarenko
 * Date: 25/08/2018
 * LinkedIn: https://www.linkedin.com/in/ponomarenkovalery
 */

object CompatInjectionManager {
    @JvmStatic
    val instance = InjectionManager(CompatLifecycleListener())
}