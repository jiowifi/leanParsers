import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String topic;
	public String background_image;
	public String organizer_name;
	public String code_of_conduct;
	public String timezone;
	public int id;
	public String state;
	public String email;
	public VersionModel _version;
	public String name;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String location_name;
	public String type;
	public String organizer_description;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String start_time;
	public String description;
	public String end_time;

	public RootModel(ArrayList<Social_linksModel> social_links, String privacy, String topic, String background_image, String organizer_name, String code_of_conduct, String timezone, int id, String state, String email, VersionModel version, String name, String schedule_published_on, Call_for_papersModel call_for_papers, String logo, String location_name, String type, String organizer_description, CopyrightModel copyright, CreatorModel creator, String start_time, String description, String end_time) {

		this.social_links = social_links;
		this.privacy = privacy;
		this.topic = topic;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.id = id;
		this.state = state;
		this.email = email;
		this._version = version;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.location_name = location_name;
		this.type = type;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this._creator = creator;
		this.start_time = start_time;
		this.description = description;
		this.end_time = end_time;

	}

}