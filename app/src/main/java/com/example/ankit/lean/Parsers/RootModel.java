import java.util.ArrayList;

class RootModel {

	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String location_name;
	public String organizer_description;
	public String state;
	public String topic;
	public String timezone;
	public VersionModel _version;
	public String email;
	public CopyrightModel _copyright;
	public String organizer_name;
	public int id;
	public CreatorModel _creator;
	public String description;
	public String name;
	public String schedule_published_on;
	public String start_time;
	public String type;
	public String logo;

	public RootModel(String background_image, Call_for_papersModel call_for_papers, String privacy, String end_time, ArrayList<Social_linksModel> social_links, String code_of_conduct, String location_name, String organizer_description, String state, String topic, String timezone, VersionModel version, String email, CopyrightModel copyright, String organizer_name, int id, CreatorModel creator, String description, String name, String schedule_published_on, String start_time, String type, String logo) {

		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.end_time = end_time;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.state = state;
		this.topic = topic;
		this.timezone = timezone;
		this._version = version;
		this.email = email;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.id = id;
		this._creator = creator;
		this.description = description;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.type = type;
		this.logo = logo;

	}

}