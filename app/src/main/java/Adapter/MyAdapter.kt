package Adapter

import Utils.PhoneModel
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import developer.abdusamid.phoneapp.R
import kotlinx.android.synthetic.main.item.view.*

class MyAdapter(context: Context, private val list: HashMap<PhoneModel,PhoneModel>) :
    ArrayAdapter<PhoneModel>(context, R.layout.item, list) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val itemView: View =
            convertView ?: LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        itemView.txt_name.text = list[position].phoneName

        return itemView
    }
}