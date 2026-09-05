package com.demo.app.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Article(
    val id: Int,
    val title: String,
    val summary: String,
    val content: String,
    val author: String,
    val date: String,
    val imageUrl: String
) : Parcelable

object DemoData {
    val articles = listOf(
        Article(
            1, "Android 15 新特性",
            "Android 15 带来了更强大的 AI 能力、更好的多窗口体验和性能优化。",
            "Android 15 核心更新包括：1) AI 接口扩展，支持端侧模型推理；2) 动态色彩系统，应用可自适应系统主题；3) 多窗口增强，支持分屏和悬浮窗；4) 性能优化，ART 垃圾回收器改进。",
            "Android 团队", "2025-09-01", "https://via.placeholder.com/150"
        ),
        Article(
            2, "Kotlin 协程实战",
            "协程是 Kotlin 的轻量级线程，适合异步编程和并发处理。",
            "协程核心概念：1) CoroutineScope 管理协程生命周期；2) suspend 函数定义协程入口；3) launch 和 async 启动协程；4) withContext 切换线程；5) Flow 处理异步数据流。",
            "Kotlin 团队", "2025-08-28", "https://via.placeholder.com/150"
        ),
        Article(
            3, "Jetpack Compose 入门",
            "Jetpack Compose 是 Android 的现代 UI 工具包，声明式构建原生界面。",
            "Compose 核心概念：1) @Composable 函数定义 UI 元素；2) 状态管理用 remember 和 mutableStateOf；3) 列表用 LazyColumn；4) 导航用 Navigation Compose。",
            "Jetpack 团队", "2025-08-20", "https://via.placeholder.com/150"
        )
    )
}
