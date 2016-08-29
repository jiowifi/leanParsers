import java.util.ArrayList;

class RootModel {

	public String email;
	public String topic;
	public String end_time;
	public String start_time;
	public String state;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public VersionModel _version;
	public String timezone;
	public String organizer_description;
	public int id;
	public String description;
	public CopyrightModel _copyright;
	public String privacy;
	public String logo;
	public String background_image;
	public String code_of_conduct;
	public String schedule_published_on;
	public String type;
	public String name;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String email, String topic, String end_time, String start_time, String state, String location_name, Call_for_papersModel call_for_papers, CreatorModel creator, VersionModel version, String timezone, String organizer_description, int id, String description, CopyrightModel copyright, String privacy, String logo, String background_image, String code_of_conduct, String schedule_published_on, String type, String name, String organizer_name, ArrayList<Social_linksModel> social_links) {

		this.email = email;
		this.topic = topic;
		this.end_time = end_time;
		this.start_time = start_time;
		this.state = state;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this._version = version;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.id = id;
		this.description = description;
		this._copyright = copyright;
		this.privacy = privacy;
		this.logo = logo;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.name = name;
		this.organizer_name = organizer_name;
		this.social_links = social_links;

	}

}