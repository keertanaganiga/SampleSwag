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
        Product("Sample Hat Black","$21","hat1"),
        Product("Sample Hat Purple","$18","hat2"),
        Product("Sample Hat White","$23","hat3"),
        Product("Sample Hat Blue","$16","hat4"),
            Product("Sample Hat Black","$21","hat1"),
            Product("Sample Hat Purple","$18","hat2"),
            Product("Sample Hat White","$23","hat3"),
            Product("Sample Hat Blue","$16","hat4"),
            Product("Sample Hat Black","$21","hat1"),
            Product("Sample Hat Purple","$18","hat2"),
            Product("Sample Hat White","$23","hat3"),
            Product("Sample Hat Blue","$16","hat4")
    )

    val hoodies= listOf(
        Product("Sample Hoodie Black","$25","hoodie1"),
        Product("Sample Hoodie Purple","$21","hoodie2"),
        Product("Sample Hoodie White","$35","hoodie3"),
        Product("Sample Hoodie Blue","$40","hoodie4"),
            Product("Sample Hoodie Black","$25","hoodie1"),
            Product("Sample Hoodie Purple","$21","hoodie2"),
            Product("Sample Hoodie White","$35","hoodie3"),
            Product("Sample Hoodie Blue","$40","hoodie4"),
            Product("Sample Hoodie Black","$25","hoodie1"),
            Product("Sample Hoodie Purple","$21","hoodie2"),
            Product("Sample Hoodie White","$35","hoodie3"),
            Product("Sample Hoodie Blue","$40","hoodie4")
    )

    val shirts= listOf(
        Product("Sample Shirt Black","$45","shirt1"),
        Product("Sample Shirt Purple","$35","shirt2"),
        Product("Sample Shirt White","$25","shirt3"),
        Product("Sample Shirt Blue","$20","shirt4"),
        Product("Sample Shirt Pink","$50","shirt5"),
            Product("Sample Shirt Black","$45","shirt1"),
            Product("Sample Shirt Purple","$35","shirt2"),
            Product("Sample Shirt White","$25","shirt3"),
            Product("Sample Shirt Blue","$20","shirt4"),
            Product("Sample Shirt Pink","$50","shirt5"),
            Product("Sample Shirt Black","$45","shirt1"),
            Product("Sample Shirt Purple","$35","shirt2"),
            Product("Sample Shirt White","$25","shirt3"),
            Product("Sample Shirt Blue","$20","shirt4"),
            Product("Sample Shirt Pink","$50","shirt5")
    )

    val digitalGood= listOf<Product>()

    fun getProducts(category: String?):List<Product>{
        return when(category){
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }


    }
}