<?php
include_once("templates/headres.php");

if(isset($_GET['id'])){

    $postid = $_GET['id'];
    $currentPost;

    foreach($post as $post) {

        if($post['id'] == $postId) {
            $currentPost = $post;
        }
    }
}

?>

<main id="post-container">
    <div class="content-container">
        <h1 id="main-title"><?= $currentPost['title'] ?></h1>
        <p id="post-description"><?= $currentPost['description'] ?></p>