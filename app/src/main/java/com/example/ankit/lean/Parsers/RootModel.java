import java.util.ArrayList;

class RootModel {

	public String state;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public CreatorModel _creator;
	public String organizer_name;
	public String timezone;
	public CopyrightModel _copyright;
	public String location_name;
	public String background_image;
	public String schedule_published_on;
	public String start_time;
	public String end_time;
	public String type;
	public String logo;
	public String topic;
	public int id;
	public String email;
	public String name;
	public String privacy;
	public VersionModel _version;
	public String code_of_conduct;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String state, Call_for_papersModel call_for_papers, String description, CreatorModel creator, String organizer_name, String timezone, CopyrightModel copyright, String location_name, String background_image, String schedule_published_on, String start_time, String end_time, String type, String logo, String topic, int id, String email, String name, String privacy, VersionModel version, String code_of_conduct, String organizer_description, ArrayList<Social_linksModel> social_links) {

		this.state = state;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this._copyright = copyright;
		this.location_name = location_name;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.end_time = end_time;
		this.type = type;
		this.logo = logo;
		this.topic = topic;
		this.id = id;
		this.email = email;
		this.name = name;
		this.privacy = privacy;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.social_links = social_links;

	}

}