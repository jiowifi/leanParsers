import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String logo;
	public CopyrightModel _copyright;
	public String start_time;
	public String organizer_description;
	public String description;
	public String location_name;
	public VersionModel _version;
	public String end_time;
	public String email;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String privacy;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String state;
	public String background_image;
	public String timezone;
	public String topic;
	public String organizer_name;
	public String schedule_published_on;

	public RootModel(String code_of_conduct, String logo, CopyrightModel copyright, String start_time, String organizer_description, String description, String location_name, VersionModel version, String end_time, String email, CreatorModel creator, Call_for_papersModel call_for_papers, int id, String privacy, String type, ArrayList<Social_linksModel> social_links, String name, String state, String background_image, String timezone, String topic, String organizer_name, String schedule_published_on) {

		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this._copyright = copyright;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.description = description;
		this.location_name = location_name;
		this._version = version;
		this.end_time = end_time;
		this.email = email;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.privacy = privacy;
		this.type = type;
		this.social_links = social_links;
		this.name = name;
		this.state = state;
		this.background_image = background_image;
		this.timezone = timezone;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;

	}

}