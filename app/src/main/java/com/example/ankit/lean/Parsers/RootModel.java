import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String email;
	public CopyrightModel _copyright;
	public int id;
	public String end_time;
	public String type;
	public CreatorModel _creator;
	public String start_time;
	public String organizer_name;
	public String timezone;
	public VersionModel _version;
	public String schedule_published_on;
	public String privacy;
	public String state;
	public String organizer_description;
	public String name;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String topic;
	public String code_of_conduct;
	public String background_image;

	public RootModel(Call_for_papersModel call_for_papers, String location_name, String email, CopyrightModel copyright, int id, String end_time, String type, CreatorModel creator, String start_time, String organizer_name, String timezone, VersionModel version, String schedule_published_on, String privacy, String state, String organizer_description, String name, String description, ArrayList<Social_linksModel> social_links, String logo, String topic, String code_of_conduct, String background_image) {

		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.email = email;
		this._copyright = copyright;
		this.id = id;
		this.end_time = end_time;
		this.type = type;
		this._creator = creator;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.state = state;
		this.organizer_description = organizer_description;
		this.name = name;
		this.description = description;
		this.social_links = social_links;
		this.logo = logo;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;

	}

}