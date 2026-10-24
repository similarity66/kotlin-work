// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
fun redact(inputDoc: String, textToBeRedacted: String, redactChar: Char = 'X'): String {
    if (textToBeRedacted.isEmpty() || inputDoc.isEmpty() || inputDoc.contains(textToBeRedacted) == false) {
        return inputDoc
    } else {
        val redaction = redactChar.toString().repeat(textToBeRedacted.length)
        val redactedResult = inputDoc.replace(textToBeRedacted, redaction)
        return redactedResult
    }

}