package com.gridlegends.graphicsassistant.data

object ParamDefinitions {

    val allParams: List<GraphicsParam> = listOf(
        GraphicsParam(
            key = "FramerateLimit",
            displayName = "Frame rate limit",
            description = "Limits target FPS. Higher FPS improves smoothness but increases heat and power consumption.",
            controlType = ParamControlType.RADIO_GROUP,
            section = ParamSection.DISPLAY,
            options = mapOf(
                "30" to "30",
                "35" to "35",
                "40" to "40",
                "60" to "60",
                "70" to "70",
                "90" to "90",
                "120" to "120"
            )
        ),
        GraphicsParam(
            key = "Setup/FixedScreenHeight",
            displayName = "Render resolution height",
            description = "Uses Setup/FixedScreenHeight. Higher values improve clarity but reduce performance.",
            controlType = ParamControlType.SLIDER,
            section = ParamSection.DISPLAY,
            minValue = 360f,
            maxValue = 2160f,
            step = 1f,
            unitSuffix = "px"
        ),
        GraphicsParam(
            key = "Graphics/FrameSizeMinimumPercentage",
            displayName = "Dynamic resolution minimum",
            description = "Graphics/FrameSizeMinimumPercentage sets the minimum dynamic render scale.",
            controlType = ParamControlType.SLIDER,
            section = ParamSection.DISPLAY,
            minValue = 30f,
            maxValue = 100f,
            step = 5f,
            unitSuffix = "%"
        ),
        GraphicsParam(
            key = "Graphics/FrameSizeMaximumPercentage",
            displayName = "Dynamic resolution maximum",
            description = "Graphics/FrameSizeMaximumPercentage sets the maximum dynamic render scale.",
            controlType = ParamControlType.SLIDER,
            section = ParamSection.DISPLAY,
            minValue = 40f,
            maxValue = 100f,
            step = 5f,
            unitSuffix = "%"
        ),
        GraphicsParam(
            key = "DynamicResolution",
            displayName = "Dynamic resolution",
            description = "Automatically adjusts render scale under load. Disabling it stabilizes resolution but requires more GPU power.",
            controlType = ParamControlType.RADIO_GROUP,
            section = ParamSection.DISPLAY,
            options = levelOptions(includeZero = true)
        ),
        GraphicsParam(
            key = "Graphics/OptimisationResolutionMultiplier",
            displayName = "Render scale",
            description = "Internal render scale. Lower values improve performance but reduce image sharpness.",
            controlType = ParamControlType.SLIDER,
            section = ParamSection.DISPLAY,
            minValue = 40f,
            maxValue = 100f,
            step = 5f,
            unitSuffix = "%"
        ),
        GraphicsParam(
            key = "VerticalSync",
            displayName = "Vertical sync (V-Sync)",
            description = "Synchronizes frames with the display to reduce tearing.",
            controlType = ParamControlType.SWITCH,
            section = ParamSection.DISPLAY,
            options = switchOptions()
        ),
        GraphicsParam(
            key = "HDR",
            displayName = "HDR",
            description = "Enable only if your display and system support HDR.",
            controlType = ParamControlType.SWITCH,
            section = ParamSection.DISPLAY,
            options = switchOptions()
        ),

        GraphicsParam(
            key = "TextureQuality",
            displayName = "Texture quality",
            description = "Controls vehicle, track, and environment texture detail. Higher settings require more graphics memory.",
            controlType = ParamControlType.LEVEL_SELECTOR,
            section = ParamSection.QUALITY,
            options = mapOf("1" to "Low", "2" to "Medium", "3" to "High", "4" to "Ultra")
        ),
        GraphicsParam(
            key = "AntiAliasing",
            displayName = "Anti-aliasing",
            description = "Smooths jagged edges. Higher settings increase GPU load.",
            controlType = ParamControlType.LEVEL_SELECTOR,
            section = ParamSection.QUALITY,
            options = mapOf("1" to "Low", "2" to "Medium", "3" to "High", "4" to "Ultra")
        ),
        GraphicsParam(
            key = "Shadows",
            displayName = "Shadow quality",
            description = "Shadow quality level: High = 3, Ultra = 4.",
            controlType = ParamControlType.LEVEL_SELECTOR,
            section = ParamSection.QUALITY,
            options = mapOf("1" to "Low", "2" to "Medium", "3" to "High", "4" to "Ultra")
        ),
        GraphicsParam(
            key = "LODQuality",
            displayName = "Level of detail (LOD)",
            description = "LOD level: High = 3, Ultra = 4.",
            controlType = ParamControlType.LEVEL_SELECTOR,
            section = ParamSection.QUALITY,
            options = mapOf("1" to "Low", "2" to "Medium", "3" to "High", "4" to "Ultra")
        ),
        GraphicsParam(
            key = "GroundCover",
            displayName = "Ground vegetation",
            description = "Controls grass and ground detail near tracks. Disabling reduces GPU load.",
            controlType = ParamControlType.LEVEL_SELECTOR,
            section = ParamSection.QUALITY,
            options = levelOptions(includeZero = true)
        ),
        GraphicsParam(
            key = "Crowds",
            displayName = "Spectators",
            description = "Spectator density. Low-end presets typically use 0.",
            controlType = ParamControlType.LEVEL_SELECTOR,
            section = ParamSection.QUALITY,
            options = mapOf("0" to "Off", "1" to "On")
        ),
        GraphicsParam(
            key = "AmbientOcclusion",
            displayName = "Ambient occlusion",
            description = "Enhances contact shadows and crevice detail.",
            controlType = ParamControlType.LEVEL_SELECTOR,
            section = ParamSection.QUALITY,
            options = levelOptions(includeZero = false)
        ),
        GraphicsParam(
            key = "LightingQuality",
            displayName = "Lighting quality",
            description = "Controls scene lighting detail.",
            controlType = ParamControlType.LEVEL_SELECTOR,
            section = ParamSection.REFLECTIONS,
            options = levelOptions(includeZero = false)
        ),

        GraphicsParam(
            key = "PostProcess",
            displayName = "Post-processing quality",
            description = "Post-processing quality: High = 3, Ultra = 4.",
            controlType = ParamControlType.LEVEL_SELECTOR,
            section = ParamSection.POST_PROCESSING,
            options = mapOf("0" to "Off", "1" to "Low", "2" to "Medium", "3" to "High", "4" to "Ultra")
        ),
        GraphicsParam(
            key = "MotionBlur",
            displayName = "Motion blur",
            description = "Blur during fast motion; may reduce image clarity.",
            controlType = ParamControlType.LEVEL_SELECTOR,
            section = ParamSection.POST_PROCESSING,
            options = mapOf("1" to "Low", "2" to "Medium", "3" to "High", "4" to "Ultra")
        ),
        GraphicsParam(
            key = "Setup/EnableSSR",
            displayName = "Screen-space reflections (SSR)",
            description = "Enables reflections on vehicles and wet surfaces at a performance cost.",
            controlType = ParamControlType.RADIO_GROUP,
            section = ParamSection.POST_PROCESSING,
            options = mapOf("0" to "Off", "3" to "High", "4" to "Ultra")
        ),
        GraphicsParam(
            key = "Setup/EnableVolumetrics",
            displayName = "Volumetric lighting toggle",
            description = "Uses Setup/EnableVolumetrics: 0 = Off, 3 = High, 4 = Ultra.",
            controlType = ParamControlType.RADIO_GROUP,
            section = ParamSection.POST_PROCESSING,
            options = mapOf("0" to "Off", "1" to "Low", "2" to "Medium", "3" to "High", "4" to "Ultra")
        ),
        GraphicsParam(
            key = "VolumetricLights",
            displayName = "Volumetric lighting quality",
            description = "Current volumetric lighting level.",
            controlType = ParamControlType.LEVEL_SELECTOR,
            section = ParamSection.POST_PROCESSING,
            options = mapOf("1" to "Low", "2" to "Medium", "3" to "High", "4" to "Ultra")
        ),
        GraphicsParam(
            key = "FireworksAndConfetti",
            displayName = "Fireworks and confetti",
            description = "Controls fireworks and confetti effects after races.",
            controlType = ParamControlType.LEVEL_SELECTOR,
            section = ParamSection.POST_PROCESSING,
            options = mapOf("1" to "Low", "2" to "Medium", "3" to "High", "4" to "Ultra")
        ),
        GraphicsParam(
            key = "Particles",
            displayName = "Particle effects",
            description = "Controls smoke, dust, sparks, and other particles.",
            controlType = ParamControlType.LEVEL_SELECTOR,
            section = ParamSection.POST_PROCESSING,
            options = levelOptions(includeZero = true)
        ),
        GraphicsParam(
            key = "WeatherEffects",
            displayName = "Weather effects",
            description = "Controls rain, snow, and other weather effects.",
            controlType = ParamControlType.LEVEL_SELECTOR,
            section = ParamSection.POST_PROCESSING,
            options = levelOptions(includeZero = false)
        ),

        GraphicsParam(
            key = "ScreenSpaceReflections",
            displayName = "Screen-space reflection quality",
            description = "Current reflection quality level.",
            controlType = ParamControlType.LEVEL_SELECTOR,
            section = ParamSection.REFLECTIONS,
            options = mapOf("1" to "Low", "2" to "Medium", "3" to "High", "4" to "Ultra")
        ),
        GraphicsParam(
            key = "VehicleReflections",
            displayName = "Vehicle reflections",
            description = "Current vehicle reflection quality.",
            controlType = ParamControlType.LEVEL_SELECTOR,
            section = ParamSection.REFLECTIONS,
            options = mapOf("1" to "Low", "2" to "Medium", "3" to "High", "4" to "Ultra")
        ),
        GraphicsParam(
            key = "SmokeShadows",
            displayName = "Smoke shadows",
            description = "Current smoke shadow quality.",
            controlType = ParamControlType.LEVEL_SELECTOR,
            section = ParamSection.REFLECTIONS,
            options = mapOf("1" to "Low", "2" to "Medium", "3" to "High", "4" to "Ultra")
        ),
        GraphicsParam(
            key = "Mirrors",
            displayName = "Rear-view mirrors",
            description = "Controls rear-view mirror rendering quality.",
            controlType = ParamControlType.LEVEL_SELECTOR,
            section = ParamSection.REFLECTIONS,
            options = levelOptions(includeZero = true)
        ),

        GraphicsParam(
            key = "PresetOverride",
            displayName = "Override game preset",
            description = "Prioritizes custom settings over the game's preset. Enable if changes do not take effect.",
            controlType = ParamControlType.SWITCH,
            section = ParamSection.DETAIL,
            options = switchOptions()
        ),
        GraphicsParam(
            key = "DevicePreset",
            displayName = "Device preset tier",
            description = "Sets the device quality tier; higher tiers may unlock additional graphics options.",
            controlType = ParamControlType.RADIO_GROUP,
            section = ParamSection.DETAIL,
            options = mapOf("0" to "Default", "1" to "High")
        ),
        GraphicsParam(
            key = "Setup/EnableEdgeBlurOnQuarterRes",
            displayName = "Low-resolution edge smoothing",
            description = "Softens edges at low render resolution. Disabling sharpens the image but may increase aliasing.",
            controlType = ParamControlType.SWITCH,
            section = ParamSection.DETAIL,
            options = switchOptions()
        ),
        GraphicsParam(
            key = "Skidmarks",
            displayName = "Tyre marks",
            description = "Controls tyre marks on the track.",
            controlType = ParamControlType.LEVEL_SELECTOR,
            section = ParamSection.DETAIL,
            options = levelOptions(includeZero = false)
        ),
        GraphicsParam(
            key = "ReduceVisibleRain",
            displayName = "Reduce visible rain",
            description = "Reduces visible rain effects to improve performance.",
            controlType = ParamControlType.SWITCH,
            section = ParamSection.POST_PROCESSING,
            options = switchOptions()
        )
    )

    fun getParamsBySection(section: ParamSection): List<GraphicsParam> {
        return allParams.filter { it.section == section }
    }

    fun findByKey(key: String): GraphicsParam? {
        return allParams.find { it.key == key }
    }

    private fun switchOptions() = mapOf("0" to "Off", "1" to "On")

    private fun levelOptions(includeZero: Boolean): Map<String, String> {
        return if (includeZero) {
            mapOf("0" to "Off", "1" to "Low", "2" to "Medium", "3" to "High", "4" to "Ultra")
        } else {
            mapOf("1" to "Low", "2" to "Medium", "3" to "High", "4" to "Ultra")
        }
    }
}
