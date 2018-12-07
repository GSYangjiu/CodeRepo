package kotlinTest

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-05-02 08:44
 * Description:
 */
fun main(args: Array<String>) {
    args.flatMap {
        it.split("_")
    }.map {
        print("$it ")
    }
}