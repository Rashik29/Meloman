val rubSymbol = '\u20BD'
/**
'totalUserCoasts' будет хранить значение всех предыдущих сумм покупок в копейках
 */
val totalUserCoasts = 2000000
/**
'newUserPurchase' будет хранить значение новой покупки в копейках
 */
val newUserPurchase = 10000
/**
'regularСustomer' будете хранить информацию о том, постоянно покупает пользователь музыку или нет
- 'true' постоянный клиент;
- 'false' непостоянный клиент;
 */
val regularСustomer = true

fun main(){

    val totalUserCoastCoins = totalUserCoasts%100
    val totalUserCoastRub = (totalUserCoasts - totalUserCoastCoins)/100

    val sumNewUserPurchaseCoins = newUserPurchase%100
    val sumNewUserPurchaseRub = (newUserPurchase - sumNewUserPurchaseCoins)/100


    if (totalUserCoastRub <= 1000 && regularСustomer == false){
        println("Сумма покупки - $sumNewUserPurchaseRub.$sumNewUserPurchaseCoins $rubSymbol")
        println("Скидок нет")

    } else if (totalUserCoastRub <= 1000 && regularСustomer == true){
        println("Сумма покупки - $sumNewUserPurchaseRub.$sumNewUserPurchaseCoins $rubSymbol")
        val sale = newUserPurchase - Math.round(newUserPurchase * 0.01)
        val sumAfterSalePurchaseCoins = sale%100
        val sumAfterSalePurchaseRub = (sale - sumAfterSalePurchaseCoins)/100
        println("Сумма с учетом скидки 1% - $sumAfterSalePurchaseRub.$sumAfterSalePurchaseCoins $rubSymbol")
        /**
        Если сумма покупки меньше 200 руб, скидка 100 руб не будет активирована.
         */
    } else if (totalUserCoastRub > 1000 && totalUserCoastRub <= 10000 && regularСustomer == false) {
        println("Сумма покупки - $sumNewUserPurchaseRub.$sumNewUserPurchaseCoins $rubSymbol")
        println("Чтобы получить 100 $rubSymbol скидку, сумма покупки должна составить больше 200 $rubSymbol")


    } else if (totalUserCoastRub > 1000 && totalUserCoastRub <= 10000 && regularСustomer == false) {
        println("Сумма покупки - $sumNewUserPurchaseRub.$sumNewUserPurchaseCoins $rubSymbol")
        val sale = newUserPurchase - 10000
        val sumAfterSalePurchaseCoins = sale % 100
        val sumAfterSalePurchaseRub = (sale - sumAfterSalePurchaseCoins) / 100
        println("Сумма с учетом скидки 100 $rubSymbol - $sumAfterSalePurchaseRub.$sumAfterSalePurchaseCoins $rubSymbol")
        /**
        Если сумма покупки меньше 200 руб, скидка 100 руб не будет активирована.
         */
    } else if (totalUserCoastRub > 1000 && totalUserCoastRub <= 10000 && regularСustomer == true) {
        println("Сумма покупки - $sumNewUserPurchaseRub.$sumNewUserPurchaseCoins $rubSymbol")
        val sale = newUserPurchase - Math.round(newUserPurchase * 0.01)
        val sumAfterSalePurchaseCoins = sale%100
        val sumAfterSalePurchaseRub = (sale - sumAfterSalePurchaseCoins)/100
        println("Сумма с учетом скидки 1% - $sumAfterSalePurchaseRub.$sumAfterSalePurchaseCoins $rubSymbol")

    } else if (totalUserCoastRub > 1000 && totalUserCoastRub <= 10000 && regularСustomer == true) {
        println("Сумма покупки - $sumNewUserPurchaseRub.$sumNewUserPurchaseCoins $rubSymbol")
        val sale = newUserPurchase - 10000
        val sumAfterSalePurchaseCoins = sale % 100
        val sumAfterSalePurchaseRub = (sale - sumAfterSalePurchaseCoins) / 100
        println("Сумма с учетом скидки 100 $rubSymbol - $sumAfterSalePurchaseRub.$sumAfterSalePurchaseCoins $rubSymbol")
        val sale1 = sale - Math.round(sale * 0.01)
        val sumAfterSalePurchaseCoins1 = sale1%100
        val sumAfterSalePurchaseRub1 = (sale1 - sumAfterSalePurchaseCoins1)/100
        println("Сумма с учетом скидки 1% - $sumAfterSalePurchaseRub1.$sumAfterSalePurchaseCoins1 $rubSymbol")

    } else if (totalUserCoastRub > 10000 && regularСustomer == false){
        println("Сумма покупки - $sumNewUserPurchaseRub.$sumNewUserPurchaseCoins $rubSymbol")
        val sale = newUserPurchase - Math.round(newUserPurchase * 0.05)
        val sumAfterSalePurchaseCoins = sale%100
        val sumAfterSalePurchaseRub = (sale - sumAfterSalePurchaseCoins)/100
        println("Сумма с учетом скидки 5% - $sumAfterSalePurchaseRub.$sumAfterSalePurchaseCoins $rubSymbol")

    } else if (totalUserCoastRub > 10000 && regularСustomer == true){
        println("Сумма покупки - $sumNewUserPurchaseRub.$sumNewUserPurchaseCoins $rubSymbol")
        val sale = newUserPurchase - Math.round(newUserPurchase * 0.05)
        val sumAfterSalePurchaseCoins = sale%100
        val sumAfterSalePurchaseRub = (sale - sumAfterSalePurchaseCoins)/100
        println("Сумма с учетом скидки 5% - $sumAfterSalePurchaseRub.$sumAfterSalePurchaseCoins $rubSymbol")
        val sale1 = sale - Math.round(sale * 0.01)
        val sumAfterSalePurchaseCoins1 = sale1%100
        val sumAfterSalePurchaseRub1 = (sale1 - sumAfterSalePurchaseCoins1)/100
        println("Сумма с учетом скидки 1% - $sumAfterSalePurchaseRub1.$sumAfterSalePurchaseCoins1 $rubSymbol")
    }
}