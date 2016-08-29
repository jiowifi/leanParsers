import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String organizer_name;
	public int id;
	public String end_time;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String privacy;
	public String type;
	public String schedule_published_on;
	public String timezone;
	public String start_time;
	public String email;
	public String description;
	public String location_name;
	public CopyrightModel _copyright;
	public String name;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String code_of_conduct;
	public String logo;
	public CreatorModel _creator;

	public RootModel(String background_image, String organizer_name, int id, String end_time, String topic, ArrayList<Social_linksModel> social_links, String organizer_description, String privacy, String type, String schedule_published_on, String timezone, String start_time, String email, String description, String location_name, CopyrightModel copyright, String name, VersionModel version, Call_for_papersModel call_for_papers, String state, String code_of_conduct, String logo, CreatorModel creator) {

		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.id = id;
		this.end_time = end_time;
		this.topic = topic;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.start_time = start_time;
		this.email = email;
		this.description = description;
		this.location_name = location_name;
		this._copyright = copyright;
		this.name = name;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this._creator = creator;

	}

}