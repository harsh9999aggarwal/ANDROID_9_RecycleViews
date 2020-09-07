    package com.example.listviews

    import kotlin.random.Random

    class Fruit(
        val name : String,
        val origin : String,
        val quantity : Int
    ) {
        companion object {
            val  FRUIT_NAMES = arrayOf(
                "Apple","Mango","Pineapple","Strawberry","Guava","Banana","Kiwi","Grapes"
            )
            val ORIGINS = arrayOf(
                "Lucknow","srinagar","Nagpur","Patna","Agra"
            )

            fun genRandomFruits(n:Int) : ArrayList<Fruit>{
                val fruitarray =ArrayList<Fruit>(n)

                for (i in 1..n){
                    fruitarray.add(
                        Fruit(
                            FRUIT_NAMES[Random.nextInt(8)],
                            ORIGINS[Random.nextInt(5)],
                            Random.nextInt(10)*100
                        )
                    )
                }

                return fruitarray
            }
        }

    }