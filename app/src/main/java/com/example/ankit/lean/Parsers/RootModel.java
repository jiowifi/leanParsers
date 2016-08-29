import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String email;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String background_image;
	public String description;
	public String topic;
	public String name;
	public int id;
	public String start_time;
	public String type;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String end_time;
	public String organizer_name;
	public VersionModel _version;
	public String organizer_description;
	public String state;
	public String privacy;
	public String code_of_conduct;
	public String logo;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String location_name, String email, CopyrightModel copyright, CreatorModel creator, String background_image, String description, String topic, String name, int id, String start_time, String type, String schedule_published_on, Call_for_papersModel call_for_papers, String timezone, String end_time, String organizer_name, VersionModel version, String organizer_description, String state, String privacy, String code_of_conduct, String logo, ArrayList<Social_linksModel> social_links) {

		this.location_name = location_name;
		this.email = email;
		this._copyright = copyright;
		this._creator = creator;
		this.background_image = background_image;
		this.description = description;
		this.topic = topic;
		this.name = name;
		this.id = id;
		this.start_time = start_time;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this._version = version;
		this.organizer_description = organizer_description;
		this.state = state;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.social_links = social_links;

	}

}