package com.example.alieskotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.card_teams.view.*

class TeamsAdapter : RecyclerView.Adapter<TeamsViewHolder>() {

    private val listTeams = listOf("FirstTeam", "Second Team", "Add New Team")

    override fun getItemCount(): Int {
        return listTeams.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamsViewHolder {
        var layoutInflater = LayoutInflater.from(parent.context)
        val teamNameField = layoutInflater.inflate(R.layout.card_lists, parent, false)

        return TeamsViewHolder(teamNameField)
    }

    override fun onBindViewHolder(holder: TeamsViewHolder, position: Int) {

        val listTeams = listTeams[position]
        holder.view.tv_teamName.text = listTeams

    }

}

class TeamsViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

}
