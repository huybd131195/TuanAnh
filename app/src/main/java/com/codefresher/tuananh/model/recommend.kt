package com.codefresher.tuananh.model

data class recommend(
    var img: Int, var rateCount: String,
    var nameAndAddress: String, var hastTag: String,
    var distance: String
) {
}