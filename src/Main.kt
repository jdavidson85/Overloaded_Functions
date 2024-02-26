fun acceptCustomerInfo(name: String, phoneNumber: String) {
    println("Residential Customer Information:")
    println("Name: $name")
    println("Phone Number: $phoneNumber")
}
 
fun acceptCustomerInfo(businessName: String, contactName: String, phoneNumber: String) {
    println("Business Customer Information:")
    println("Business Name: $businessName")
    println("Contact Name: $contactName")
    println("Phone Number: $phoneNumber")
}

fun main() {
    // Residential Info
    acceptCustomerInfo("Luke Davidson", "098-765-4321")
 
    // Business Info
    acceptCustomerInfo("Dub Boyz Gaming.", "Joe Davidson", "123-456-7890")
}
