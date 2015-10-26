package services

import scala.concurrent.{ExecutionContext, Future}

object ContactService {

  private val Data = Map(
    "atryyang@thoughtworks.com" -> "Yang Bo",
    "invalid-mail-address" -> "N/A",
    "john.smith@gmail.com" -> "John Smith"
  )

  /**
   * Fetches list of email of all contacts from a remote service.
   */
  def asyncGetEmailList()(implicit ec: ExecutionContext): Future[List[String]] = Future {
    Data.keys.toList
  }

  /**
   * Query the contact full name that corresponds to an email from a remote service.
   */
  def asyncGetContactNameByEmail(email: String)(implicit ec: ExecutionContext): Future[String] = Future {
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
