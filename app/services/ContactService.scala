package services

object ContactService {

  private val Data = Map(
    "atryyang@thoughtworks.com" -> "Yang Bo",
    "invalid-mail-address" -> "N/A",
    "john.smith@gmail.com" -> "John Smith"
  )

  /**
   * Fetches list of email of all contacts from a remote service.
   */
  def getEmailList(): List[String] = {
    Data.keys.toList
  }

  /**
   * Query the contact full name that corresponds to an email from a remote service.
   */
  def getContactNameByEmail(email: String): String = {
    Data.get(email) match {
      case None => {
        throw new NoSuchElementException
      }
      case Some(name) => {
        name
      }
    }
  }

}
