package jp.techacademy.takeshi.kataoka.taskapp

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.io.Serializable
import java.util.Date

open class Task : RealmObject(), Serializable {
    var title: String = ""     // タイトル
    var contents: String = ""  // 内容
    var date: Date = Date()    // 日時

    // idをプリマリーキーとして設定
    @PrimaryKey
    var id: Int = 0
}