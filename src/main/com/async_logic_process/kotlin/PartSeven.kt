/**
 * Kotlin Data Structures implemented, Practices coded for List,Set,Map
 */

fun main(){
    declareImmutableList() //List
    declareMutableList() // ArrayList
    removalPractice()
    listOperations()
    arrayListOperations()
    zoo()
    set()
    hashSet()
    hashSetFuncions()
    dressList()
    map()
    hashMaps()
    mapDataCheck()
}
/**
 * It is very important that ArrrayList is mutable in Kotlin. We can change or manipulate data inside list
 */
fun declareMutableList() {
    val colors= arrayListOf("Red","Blue","Yellow") // implicit definition
    var explicitColorsListDeclaration:ArrayList<String> = arrayListOf("Red","Blue","Yellow") //Explicit definition of list
    colors.add("Green") //List element addition
    println(colors)

    val moreColors = arrayListOf("Gray","Black")
    colors.addAll(moreColors) //Collection addition will add all elements in given parameter collection to base list.
    println(colors)

    colors.remove("Red") // Removal of element from list. If duplicates exist it removes first one like JAVA
    println(colors)

    colors.removeAll(moreColors) //Collection removal from another collection
    println(colors)

    colors.removeAt(0) //Removal of specific index in list
    println(colors)

    println(SEPARATOR)
}

/**
 * It is very important that as default "list" is immutable in Kotlin
 */
fun declareImmutableList(){
    val colors = listOf("Red","Blue","Yellow") //Immutable List declaration
    val emptyList = listOf<String>() // Empty list declaration, we have to give which type of elements will be in list. "String" in this case
    val nullList = listOf(null,null, null) // Null can be considered type, In Kotlin lists can instantiated with nulls
    println(colors)
    println(colors[0]) // Will print red. This is index access in Kotlin
    println(colors.size) // Standart size access in Kotlin
    //println(colors[10]) //Will throw exception, ArrayIndexOutBoundException standart out index

    println(SEPARATOR)
}

fun removalPractice(){
    val itemList = arrayListOf("laptop","mouse","pen","paper","mug","phone") // arrayList because will be changed
    val toBeRemovedItems = listOf("pen","paper","mug","phone") // list because will not be changed
    itemList.removeAll(toBeRemovedItems) //also return boolean true OR false if remove operation succeeded
    println(itemList)

    println(SEPARATOR)
}

fun listOperations(){
    val colorList = listOf("Red","Green","Yellow")
    println(colorList.size) // List size

    println(colorList.contains("Red")) // Checks if element contained, return boolean

    val newColors = listOf("Red","Green")
    println(colorList.containsAll(newColors))// Checks if collection contains every element of given collection, return boolean

    println(colorList.indexOf("Red"))// returns index position of "Red"

    println(colorList.lastIndexOf("Red")) // returns index of last occurrence of given element in collection

    println(SEPARATOR)
}

fun arrayListOperations(){
    val colorList = arrayListOf<String>("Red","Green","Yellow")

    colorList.set(0,"Black") //Replace index 0 "Red" with "Black"
    println(colorList)

    val subList = colorList.subList(0,2) //Sublist starts from 0 to 2 (2 NOT INCLUDED, upperBound not includes) so there will be 2 elements instead 3.
    println(subList)

    println(colorList.reversed()) //Reverse the list

    colorList.clear() //Clears list make it empty
    println(colorList)

    val isEmpty = colorList.isEmpty() // Returns boolean according to list is empty or not
    println(isEmpty)

    println(SEPARATOR)
}

fun zoo(){
    val animals = arrayListOf<String>("Lion","Zebra","Monkey","Elephant")
    val newAnimals = listOf("Panda","Cheetah")

    animals.addAll(newAnimals)
    println(animals)

    animals.remove("Lion")
    println(animals)

    val haveRequired = animals.contains("Elephant") && animals.contains("Giraffe")
    println(haveRequired)

    println(SEPARATOR)

}

fun set(){
    val set = setOf(3,4,5,6,6) //Duplicate will be removed automatically in set
    println(set)

    val emptySet = setOf<Int>()
    println(emptySet)

    val setWithNull= setOf(null,null) //Only one null element added
    print(setWithNull)

    println(SEPARATOR)
}

fun hashSet(){
    val hashSet = hashSetOf(1,2,3,4)
    val anotherHashSet = setOf(5,6,7)

    hashSet.addAll(anotherHashSet)// Add set to another

    hashSet.remove(1) // Remove element 1

    val numberList = listOf(12,435,345,123,5,1243,15,15,15,636351,135415)
    hashSet.addAll(numberList) // List also collection, we can add list as well to Set with .addAll()

    val customers = hashSetOf("Jon","Jam","Kim")
    customers.add("Ogi")
    println(customers)
    customers.remove("Kim")
    println(customers)
    println("Who you want to add")
    val input = readLine()?:""
    customers.add(input)
    println(customers)
    println("Who you want to remove")
    val inp = readLine()?:""
    customers.remove(inp)
    println(customers)

    println(SEPARATOR)
}

fun hashSetFuncions(){
    val numberSet = hashSetOf(1,2,3,4,5,6)

    println(numberSet.size) // Set size

    println(numberSet.contains(1)) // Checks if element contained, return boolean

    val set = setOf(1,7)
    println(numberSet.containsAll(set))// Checks if Set contains every element of given collection, return boolean

    val isEmpty = numberSet.isEmpty() // Returns boolean according to Set is empty or not

    numberSet.retainAll(set) //will only take intersection of 2 different sets.(Common elements). and set it to that main set
    println(numberSet)

    numberSet.clear() // clears everything as regular collection transaction

    println(SEPARATOR)
}

fun dressList(){
    val acceptedColors = hashSetOf("White","Black","Grey")
    val myColors = setOf("Blue","Red","Black","Green")

    acceptedColors.retainAll(myColors)
    println("The colors I can choose is : $acceptedColors")

    acceptedColors.add("Red")
    acceptedColors.add("White")
    acceptedColors.add("Grey")

    acceptedColors.retainAll(myColors)
    println("The colors I can choose is : $acceptedColors")
}

fun map(){
    val map = mapOf(Pair(1,"Ogi"), Pair(2,"James"),Pair(3,"Johan")) // Implementation one
    val map2:Map<Int,String> = mapOf(Pair(1,"Ogi"),Pair(2,"James"),Pair(3,"Johan")) // Implementation two
    val map3 = mapOf<Int,String>(Pair(1,"Ogi"),Pair(2,"James"),Pair(3,"Johan")) // Implementation three
    val map4 = mapOf<Int,String>() // Empty Map

    val getByMapKey = map.get(1) //get with key
    println(getByMapKey)

    val keySet = map.keys  // Set of keys
    println(keySet)

    val valuesAsCollection = map.values // Collection of map values
    println(valuesAsCollection)

    println(SEPARATOR)
}

fun hashMaps(){
    val hashMap = hashMapOf(Pair(1,"one"), Pair(2,"two"),Pair(3,"three"))
    hashMap.put(5,"five") // adds element
    println(hashMap)

    val secondMap = mapOf(Pair(4,"four"),Pair(6,"six"))
    hashMap.putAll(secondMap)
    println(hashMap)

    hashMap.remove(5) // remove Pair with key 5
    println(hashMap)

    hashMap.replace(1,"ONEONEONEONEONE") // Replace key 1 with new value
    println(hashMap)

    val isContainKey = hashMap.contains(1) //Checks if contains key
    println(isContainKey)

    val isContainValue = hashMap.containsValue("three") //Checks if contains value
    println(isContainValue)

    val size = hashMap.size //size of map for each pair
    println(size)

    val isEmpty = hashMap.isEmpty() // checks empty or Not, also isNotEmpty() can be used
    println(isEmpty)

    hashMap.clear() // clear map

    println(SEPARATOR)
}

fun mapDataCheck(){
    val attendance = hashMapOf(Pair("23 Sept",2000),Pair("24 Sept",1000),Pair("25 Sept", 300))
    attendance.put("26 Sept", 5000)

    val totalAttended25And26 = attendance["25 Sept"]?.plus(attendance["26 Sept"]?:0)
    println(totalAttended25And26)

    val isDataFor22Available = attendance.contains("22 Sept")
    println(isDataFor22Available)
}