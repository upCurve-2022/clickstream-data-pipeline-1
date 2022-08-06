package exceptions

object Exceptions{
  case class FileReaderException(message: String) extends Exception(message)
  case class FileWriterException(message: String) extends Exception(message)
  case class DataframeIsEmptyException(message:String) extends Exception(message)
  case class ColumnNotFoundException(message:String) extends Exception(message)
}
