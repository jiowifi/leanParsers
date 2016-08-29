import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String start_time;
	public String timezone;
	public String email;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String name;
	public String description;
	public CreatorModel _creator;
	public String state;
	public String organizer_name;
	public String topic;
	public int id;
	public String type;
	public String end_time;
	public String privacy;
	public String background_image;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String location_name;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String organizer_description, String start_time, String timezone, String email, CopyrightModel copyright, String code_of_conduct, String name, String description, CreatorModel creator, String state, String organizer_name, String topic, int id, String type, String end_time, String privacy, String background_image, String logo, Call_for_papersModel call_for_papers, String schedule_published_on, String location_name, VersionModel version, ArrayList<Social_linksModel> social_links) {

		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.timezone = timezone;
		this.email = email;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.description = description;
		this._creator = creator;
		this.state = state;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.id = id;
		this.type = type;
		this.end_time = end_time;
		this.privacy = privacy;
		this.background_image = background_image;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this._version = version;
		this.social_links = social_links;

	}

}