import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String description;
	public String end_time;
	public int id;
	public String start_time;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String type;
	public String name;
	public String logo;
	public CreatorModel _creator;
	public String privacy;
	public String code_of_conduct;
	public String organizer_description;
	public String background_image;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String email;
	public String timezone;
	public String schedule_published_on;
	public String state;

	public RootModel(ArrayList<Social_linksModel> social_links, String topic, String description, String end_time, int id, String start_time, CopyrightModel copyright, VersionModel version, String type, String name, String logo, CreatorModel creator, String privacy, String code_of_conduct, String organizer_description, String background_image, String organizer_name, Call_for_papersModel call_for_papers, String location_name, String email, String timezone, String schedule_published_on, String state) {

		this.social_links = social_links;
		this.topic = topic;
		this.description = description;
		this.end_time = end_time;
		this.id = id;
		this.start_time = start_time;
		this._copyright = copyright;
		this._version = version;
		this.type = type;
		this.name = name;
		this.logo = logo;
		this._creator = creator;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.email = email;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.state = state;

	}

}