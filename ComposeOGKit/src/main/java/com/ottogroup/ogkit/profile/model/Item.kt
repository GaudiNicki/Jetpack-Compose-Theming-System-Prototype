package com.ottogroup.ogkit.profile.model

interface Item

data class TextItem(
    val title: String
) : Item

data class ImageItem(
    val drawableResId: Int,
    val contentDescription: String?
) : Item
