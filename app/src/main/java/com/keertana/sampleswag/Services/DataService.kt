package com.keertana.sampleswag.Services

import com.keertana.sampleswag.Model.Category
import com.keertana.sampleswag.Model.Product

object DataService {

    val categories= listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )

    val hats= listOf(
        Product("Sample Hat Black","$21","hat01"),
        Product("Sample Hat Purple","$18","hat02"),
        Product("Sample Hat White","$23","hat03"),
        Product("Sample Hat Blue","$16","hat04")
    )

    val hoodies= listOf(
        Product("Sample Hoodie Black","$25","hoodie01"),
        Product("Sample Hoodie Purple","$21","hoodie02"),
        Product("Sample Hoodie White","$35","hoodie03"),
        Product("Sample Hoodie Blue","$40","hoodie04")
    )

    val shirts= listOf(
        Product("Sample Shirt Black","$45","shirt01"),
        Product("Sample Shirt Purple","$35","shirt02"),
        Product("Sample Shirt White","$25","shirt03"),
        Product("Sample Shirt Blue","$20","shirt04"),
        Product("Sample Shirt Pink","$50","shirt05"),
    )
}