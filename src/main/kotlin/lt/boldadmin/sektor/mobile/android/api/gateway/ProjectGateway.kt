package lt.boldadmin.sektor.mobile.android.api.gateway

import lt.boldadmin.sektor.mobile.android.api.type.entity.Project

interface ProjectGateway {

    fun getProjects(): Collection<Project>
}
