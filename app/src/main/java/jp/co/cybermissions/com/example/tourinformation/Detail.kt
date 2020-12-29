package jp.co.cybermissions.com.example.tourinformation

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Detail(val id: String,
                  val name: String,
                  val about: String,
                  var text: String = "") : Parcelable