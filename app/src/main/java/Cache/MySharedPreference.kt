package Cache

import Utils.PhoneModel
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object MySharedPreference {
    private const val NAME = "my_catche_file"
    private const val MODE = Context.MODE_PRIVATE
    private lateinit var preferences: SharedPreferences

    fun init(context: Context) {
        preferences = context.getSharedPreferences(NAME, MODE)
    }

    private inline fun SharedPreferences.edit(operation: (SharedPreferences.Editor) -> Unit) {
        val editor = edit()
        operation(editor)
        editor.apply()
    }

    var obektString: ArrayList<PhoneModel>
        get() = gsonStringToArray(preferences.getString("object", "[]")!!)
        set(value) = preferences.edit {
            it.putString("object", arrayToGsonString(value))
        }

    private fun arrayToGsonString(arrayList: ArrayList<PhoneModel>): String {
        return Gson().toJson(arrayList)
    }

    private fun gsonStringToArray(gsonString: String): ArrayList<PhoneModel> {
        val typeToken = object : TypeToken<ArrayList<PhoneModel>>() {}.type
        return Gson().fromJson(gsonString, typeToken)
    }
}