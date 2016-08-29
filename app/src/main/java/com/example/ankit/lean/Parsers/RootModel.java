import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String location_name;
	public int id;
	public String timezone;
	public String state;
	public CreatorModel _creator;
	public String description;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String topic;
	public String organizer_name;
	public String end_time;
	public String email;
	public String type;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String name;
	public VersionModel _version;
	public String background_image;
	public String schedule_published_on;
	public String logo;

	public RootModel(String organizer_description, String location_name, int id, String timezone, String state, CreatorModel creator, String description, String code_of_conduct, Call_for_papersModel call_for_papers, String start_time, String topic, String organizer_name, String end_time, String email, String type, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String privacy, String name, VersionModel version, String background_image, String schedule_published_on, String logo) {

		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.id = id;
		this.timezone = timezone;
		this.state = state;
		this._creator = creator;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.email = email;
		this.type = type;
		this._copyright = copyright;
		this.social_links = social_links;
		this.privacy = privacy;
		this.name = name;
		this._version = version;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;

	}

}