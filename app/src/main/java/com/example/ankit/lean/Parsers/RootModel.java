import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String email;
	public CreatorModel _creator;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String description;
	public String topic;
	public String name;
	public int id;
	public String code_of_conduct;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String type;
	public String privacy;
	public String end_time;
	public String state;
	public String logo;
	public String start_time;
	public String background_image;
	public String timezone;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String organizer_description, String email, CreatorModel creator, String schedule_published_on, Call_for_papersModel call_for_papers, VersionModel version, String description, String topic, String name, int id, String code_of_conduct, String organizer_name, CopyrightModel copyright, String type, String privacy, String end_time, String state, String logo, String start_time, String background_image, String timezone, String location_name, ArrayList<Social_linksModel> social_links) {

		this.organizer_description = organizer_description;
		this.email = email;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.description = description;
		this.topic = topic;
		this.name = name;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.type = type;
		this.privacy = privacy;
		this.end_time = end_time;
		this.state = state;
		this.logo = logo;
		this.start_time = start_time;
		this.background_image = background_image;
		this.timezone = timezone;
		this.location_name = location_name;
		this.social_links = social_links;

	}

}