package com.gridlegends.graphicsassistant.data

import java.io.Serializable

enum class ParamControlType {
    SLIDER,
    SWITCH,
    RADIO_GROUP,
    LEVEL_SELECTOR
}

data class GraphicsParam(
    val key: String,
    val displayName: String,
    val description: String,
    val controlType: ParamControlType,
    val section: ParamSection,
    val minValue: Float = 0f,
    val maxValue: Float = 100f,
    val step: Float = 1f,
    val unitSuffix: String = "",
    val options: Map<String, String> = emptyMap()
)

enum class ParamSection(val title: String, val icon: String) {
    DISPLAY("Display and frame rate", "Display"),
    QUALITY("Graphics quality", "Quality"),
    POST_PROCESSING("Post-processing", "Effects"),
    REFLECTIONS("Reflections and lighting", "Reflections"),
    DETAIL("Details and advanced", "Details")
}

data class ParamValue(
    val key: String,
    val value: String,
    val originalValue: String = value,
    val isModified: Boolean = false
) : Serializable
