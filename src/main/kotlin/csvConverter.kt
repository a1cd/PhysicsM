/**
 * Allows for easier converting of values to a google sheet
 */
open class csvConverter (
    open val csvString: String,
    open val header: String
) {
    operator fun plus(other: csvConverter): csvConverter {
        return csvConverter(
            this.csvString+"\t"+ other.csvString,
            this.header+"\t"+other.header
        )
    }
}