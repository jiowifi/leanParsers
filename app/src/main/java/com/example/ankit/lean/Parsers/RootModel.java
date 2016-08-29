import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String description;
	public CreatorModel _creator;
	public int id;
	public String organizer_name;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String privacy;
	public String location_name;
	public String logo;
	public String state;
	public String name;
	public String type;
	public String code_of_conduct;
	public String start_time;
	public String schedule_published_on;
	public String organizer_description;
	public String timezone;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String email;

	public RootModel(Call_for_papersModel call_for_papers, String topic, String description, CreatorModel creator, int id, String organizer_name, VersionModel version, CopyrightModel copyright, String privacy, String location_name, String logo, String state, String name, String type, String code_of_conduct, String start_time, String schedule_published_on, String organizer_description, String timezone, String end_time, ArrayList<Social_linksModel> social_links, String background_image, String email) {

		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.description = description;
		this._creator = creator;
		this.id = id;
		this.organizer_name = organizer_name;
		this._version = version;
		this._copyright = copyright;
		this.privacy = privacy;
		this.location_name = location_name;
		this.logo = logo;
		this.state = state;
		this.name = name;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.end_time = end_time;
		this.social_links = social_links;
		this.background_image = background_image;
		this.email = email;

	}

}