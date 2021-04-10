package kr.ac.kumoh.s20160553.aop_part2_chapter04

import androidx.room.Database
import androidx.room.RoomDatabase
import kr.ac.kumoh.s20160553.aop_part2_chapter04.dao.HistroyDao
import kr.ac.kumoh.s20160553.aop_part2_chapter04.model.History

@Database(entities = [History::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun historyDao(): HistroyDao
}