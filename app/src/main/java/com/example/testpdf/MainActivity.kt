
import android.content.Context.DOWNLOAD_SERVICE
import android.support.v4.content.ContextCompat.getSystemService
import android.app.DownloadManager
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import java.io.File


//package com.example.testpdf
//
//import android.app.DownloadManager
//import android.content.Context
//import android.net.Uri
//import android.support.v7.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.Toast
//import com.github.barteksc.pdfviewer.util.FitPolicy
//import kotlinx.android.synthetic.main.activity_main.*
//import java.io.*
//
//class MainActivity : AppCompatActivity() {
//
//	override fun onCreate(savedInstanceState: Bundle?) {
//		super.onCreate(savedInstanceState)
//		setContentView(R.layout.activity_main)
//
//	//	val uri = Uri.parse("http://www.africau.edu/images/default/sample.pdf")
//
//
//		val document = "fgfg"
//
//		//val downloadManager = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
//
//		val uri = Uri.parse("http://www.africau.edu/images/default/sample.pdf")
//
////	/*	val request: DownloadManager.Request = DownloadManager.Request(uri)
////		request.setNotificationVisibility(Do*/wnloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
////		downloadManager.enqueue(request)
//
//		val PDFFile = File(getExternalFilesDir(null),"Dummy")
//
//
//
//		//val PDFFile = File(Uri.parse("http://www.africau.edu/images/default/sample.pdf"))
//
//		val request = DownloadManager.Request(uri)
//				.setTitle("Dummy File")// Title of the Download Notification
//				.setDescription("Downloading")// Description of the Download Notification
//				.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE)// Visibility of the download Notification
//				.setDestinationUri(Uri.fromFile(PDFFile))// Uri of the destination file
//				.setAllowedOverMetered(true)// Set if download is allowed on Mobile network
//				.setAllowedOverRoaming(true)// Set if download is allowed on roaming network
//
//
//
//		val  downloadManager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
//
//		val downloadID = downloadManager.enqueue(request)
//
//
//
//
//		pdf_view.fromFile(PDFFile)
//				.enableSwipe(true) // allows to block changing pages using swipe
//				.swipeHorizontal(true)
//				.enableDoubletap(true)
//				.onLoad {
//					Toast.makeText(this, "test", Toast.LENGTH_LONG).show()
//				}
//				.defaultPage(0)
//				.enableAnnotationRendering(false) // render annotations (such as comments, colors or forms)
//				.password(null)
//				.scrollHandle(null)
//				.enableAntialiasing(true) // improve rendering a little bit on low-res screens
//				// spacing between pages in dp. To define spacing color, set view background
//				.spacing(0)
//				.pageFitPolicy(FitPolicy.WIDTH)
//				.load()
//	}
//}
