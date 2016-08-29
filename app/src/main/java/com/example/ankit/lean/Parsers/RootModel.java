import java.util.ArrayList;

class RootModel {

	public String name;
	public String organizer_name;
	public String type;
	public String timezone;
	public String email;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String privacy;
	public String state;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public CreatorModel _creator;
	public String end_time;
	public String start_time;
	public String schedule_published_on;
	public String description;
	public String logo;
	public int id;
	public String topic;
	public String code_of_conduct;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String name, String organizer_name, String type, String timezone, String email, String organizer_description, CopyrightModel copyright, String privacy, String state, String background_image, Call_for_papersModel call_for_papers, VersionModel version, CreatorModel creator, String end_time, String start_time, String schedule_published_on, String description, String logo, int id, String topic, String code_of_conduct, String location_name, ArrayList<Social_linksModel> social_links) {

		this.name = name;
		this.organizer_name = organizer_name;
		this.type = type;
		this.timezone = timezone;
		this.email = email;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.privacy = privacy;
		this.state = state;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this._creator = creator;
		this.end_time = end_time;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.logo = logo;
		this.id = id;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.social_links = social_links;

	}

}