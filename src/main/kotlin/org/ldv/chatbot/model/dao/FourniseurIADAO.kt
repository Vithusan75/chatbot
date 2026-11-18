package org.ldv.chatbot.model.dao

import org.ldv.chatbot.model.entity.FourniseurIA
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface FourniseurIADAO : JpaRepository<FourniseurIA, Long>
